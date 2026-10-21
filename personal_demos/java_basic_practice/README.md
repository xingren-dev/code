# java_basic_practice

- 学什么：JavaSE 基础（跟着 `D:\学习资料\Java+AI（Java基础入门到大牛）` 走）
- 来源：JavaSE 基础入门 9 天课程 + 基础加强 6 天课程
- 日期：2026-09-23
- 状态：doing
- 备注：本目录存放 L1 阶段的所有练习代码，一个知识点一个子文件夹

## 目录约定

子文件夹命名 `知识点_主题`，例如：

```
java_basic_practice/
├── day01_basic_syntax/        字面量、变量、数据类型
├── day02_operator_input/      运算符、键盘录入（Scanner）
├── day03_flow_control/        分支与循环
├── day04_array/               数组、二维数组
├── day05_oop_basic/           类与对象、封装、static
├── day06_oop_inherit/         继承、多态
├── day07_oop_advanced/        抽象类、接口、枚举、单例
├── day08_lambda_api/          Lambda、方法引用、String、集合
├── day09_project_huarongdao/  数字华容道（综合项目）
└── day10_collection/          集合框架（基础加强）
```

> **关于 `day02_operator_input`**：入门课程的视频里**没有 day02**（day01 直接跳到 day03），缺的正好是「运算符 + 键盘录入」这一整块。所以这个目录的内容是从 `最新Java零基础600集` 里补的 8 集，不是课程原有的 day02：
>
> ```
> 024 加号运算符   047 算术运算符   049 接收用户键盘输入(Scanner)   050 自增自减
> 054 关系运算符   055 逻辑运算符   063 赋值运算符                  064 条件运算符
> ```
>
> 位运算符（056-062）跳过。详见 `D:\obsidian\知识库\01-Project\Java自学课表.md` 第五节。

## 每个子文件夹里放什么

- `Main.java` 或 `Demo.java` —— 当天的练习代码
- 类名要与文件名一致（Java 编译器要求）
- 练习代码允许粗糙、允许注释掉一堆试错过程，这里不是归档级的正式代码
- 如果某个知识点练得比较像样，可以另写一个简短的 `README.md` 记一下关键点

## 注意

- 按 `D:\code\README.md` 规范：本目录**不放** `target/`、`out/`、`.idea/`、`*.iml` 等 IDE 与构建产物
- 用 IDEA 建工程时，`.idea/` 会生成在本目录下，这是正常的临时产物，不参与归档即可
- 每天练习完顺手把关键代码在 `D:\obsidian\知识库\02-Areas\Java基础学习笔记.md` 里记 3 行
