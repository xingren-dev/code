package com.xingren.movie;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MovieService {

    private static List<Movie> movies = new ArrayList<>();
    private static Scanner sc = new Scanner(System.in);

    public void start() {

        while (true) {
            System.out.println("======电影信息操作系统======");
            System.out.println("1.上架");
            System.out.println("2.下架某个电影");
            System.out.println("3.查询某个电影");
            System.out.println("4.封杀某个明星");
            System.out.println("5.退出系统");
            System.out.println("6.展示全部电影");
            System.out.println("7.修改某个电影");
            System.out.print("请输入操作命令:");

            String command = sc.next();
            switch (command) {
                case "1":
                    addMovie();
                    break;
                case "2":
                    removeMovie();
                    break;
                case "3":
                    queryMovie();
                    break;
                case "4":
                    deleteStar();
                    break;
                case "5":
                    System.out.println("系统已退出");
                    return;
                case "6":
                    queryAllMovies();
                    break;
                case "7":
                    updateMovie();
                    break;
                default:
                    System.out.println("输入的命令有误");
                    break;

            }
        }
    }

    private void updateMovie() {
        System.out.println("======修改电影======");
        System.out.println("请输入要修改的电影名称");
        String name = sc.next();
        Movie movie = queryMovieByname(name);

        if (movie != null) {
            System.out.println("请输入要修改的字段：1.名称 2.评分 3.演员 4.价格");
            int command = sc.nextInt();
            switch (command) {
                case 1:
                    System.out.println("修改电影名称");
                    movie.setName(sc.next());
                    break;
                case 2:
                    System.out.println("修改电影评分");
                    movie.setScore(sc.nextDouble());
                    break;
                case 3:
                    System.out.println("修改电影演员");
                    movie.setActor(sc.next());
                    break;
                case 4:
                    System.out.println("修改电影价钱");
                    movie.setPrice(sc.nextDouble());
                    break;
                default:
                    System.out.println("输入有误");
                    break;
            }
        } else {
            System.out.println("没有这部电影");
        }
    }

    private void queryAllMovies() {
        System.out.println("======展示全部电影======");
        for (Movie movie : movies) {
            System.out.println(movie);
        }
    }

    private void deleteStar() {
        System.out.println("======封杀明星======");
        System.out.println("请输入要封杀的明星");
        String star = sc.next();

        for (int i = 0; i < movies.size(); i++) {
            Movie movie = movies.get(i);
            if (movie.getActor().contains(star)) {
                movies.remove(movie);

                i--;
            }
        }
        System.out.println("封杀成功");
        queryAllMovies();

    }


    private void removeMovie() {
        System.out.println("======下架电影======");
        System.out.print("请输入想下架的电影名称:");
        String name = sc.next();
        Movie movie = queryMovieByname(name);
        if (movie != null) {
            movies.remove(movie);
        } else {
            System.out.println("没有这部电影，无法下架");
        }

    }


    private void queryMovie() {
        System.out.println("======查询电影======");
        System.out.print("请输入电影名称:");
        String name = sc.next();
        Movie movie = queryMovieByname(name);
        if (movie != null) {
            System.out.println(movie);
        } else {
            System.out.println("没有找到这个电影");
        }


    }

    //根据电影名称查询电影对象，并返回
    public Movie queryMovieByname(String name) {
        for (Movie movie : movies) {
            if (movie.getName().equals(name)) {
                return movie;
            }
        }
        return null;
    }

    /**
     * 上架电影
     */
    private void addMovie() {

        System.out.println("======上架电影======");

        Movie movie = new Movie();
        System.out.print("请输入电影名称:");
        movie.setName(sc.next());

        System.out.print("请输入电影主演:");
        movie.setActor(sc.next());

        System.out.print("请输入电影价格:");
        movie.setPrice(sc.nextDouble());

        System.out.print("请输入电影评分:");
        movie.setScore(sc.nextDouble());

        movies.add(movie);

        System.out.println("上架成功");
    }
}
