package com.xingren.movie;

public class Test {
    public static void main(String[] args) {
        //1.设计电影类Movie,以便创建电影对象，封装电影数据
        //2.封装系统中所有电影数据

        Movie[] movies = new Movie[6];

        movies[0] = new Movie(1, "星际穿越", 9.6, "安妮海瑟薇");
        movies[1] = new Movie(2, "盗梦空间", 9.5, "莱昂纳多");
        movies[2] = new Movie(3, "霸王别姬", 9.4, "张国荣");
        movies[3] = new Movie(4, "肖申克的救赎", 9.3, "蒂姆罗宾斯");
        movies[4] = new Movie(5, "教父", 9.2, "马龙白兰度");
        movies[5] = new Movie(6, "辛德勒的名单", 9.1, "拉塞尔克劳福德");

        //3.创建电影操作类MovieOperator
        MovieOperator mo= new MovieOperator(movies);
        mo.printAllMovies();
        mo.searchMovieById();
    }
}
