package com.xingren.movie;

import java.util.Scanner;

public class MovieOperator {
    private Movie[] movies;
    public MovieOperator(Movie[] movies) {
        this.movies = movies;
    }

    public void printAllMovies() {
        for (int i = 0; i < movies.length; i++) {
            Movie m = movies[i];
            System.out.println(m.getId() + "\t" + m.getName() + "\t" + m.getPrice() + "\t" + m.getActor());
        }

    }

    //根据Id查询电影
    public void searchMovieById() {
        Scanner sc = new Scanner(System.in);
        System.out.print("请输入要查询的Id：");
        int id = sc.nextInt();
        for (int i = 0; i < movies.length; i++) {
            Movie m = movies[i];
            if (m.getId() == id) {
                System.out.println(m.getId() + "\t" + m.getName() + "\t" + m.getPrice() + "\t" + m.getActor());
                return;
            }
        }
        System.out.println("没有找到该Id的电影");

    }
}
