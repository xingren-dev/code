# course 使用规则

> 本目录是 `D:\code\` 的四大子目录之一，用于归档**大学各门专业课的日常作业、课堂练习、课后实操代码**。
> 定位一句话：**临时性的、课程驱动的、跑完就完事的小代码放这里**；只要它长出了「项目架构」或「自主学习」的属性，就该往别处走。
> 通用约束仍受 `D:\code\README.md` 管理（小写下划线、无中文、无空格、无特殊符号）。

---

## 一、核心特征

- **单文件、小型练习代码**，无完整项目架构，仅为课程基础练习
- 按**课程**分类管理，是日常课业的基础代码归档目录
- 包含但不限于：C 语言、Java、Python、数据结构、数据库、操作系统、软件工程等课程的课后练习、课堂小案例、随堂实操代码

---

## 二、目录结构

### 1. 一级目录 = 课程名

```
course/
├── c_language/
├── java/
├── python/
├── data_structure/
├── database/
├── operating_system/
├── software_engineering/
└── computer_network/
```

- 课程名尽量用**英文小写下划线**（如 `computer_network/`）
- ❌ 不要出现 `C语言`、`数据结构`、`大二上` 这类中文或按时间维度的命名

### 2. 二级目录 = 章节或实验编号

```
course/data_structure/
├── ch01_intro/
├── ch02_linear_list/
├── ch03_stack_queue/
└── lab02_linked_list/
```

- `ch01` ~ `ch99`：章节内容、课后习题
- `lab01` ~ ：课堂实操、上机实验
- **刚起步只有两三个文件时，直接平铺在课程文件夹里即可**，不必为了规范硬造目录；文件到 5 个以上再按章拆分

### 3. 文件命名

| 类型 | 规则 | 示例 |
|---|---|---|
| 目录 | 小写 + 下划线 | `ch03_stack_queue/` |
| C / Python / SQL 等源文件 | 小写 + 下划线，能看懂含义 | `bubble_sort.c`、`student_score_rank.py`、`ch02_select.sql` |
| **Java 源文件（唯一例外）** | 驼峰式，**必须与 `public class` 类名完全一致** | `StudentScoreRank.java` |

> Java 的文件名受编译器强制约束（`public class` 类名必须等于文件名），这是唯一允许不用下划线风格的地方；**目录名仍保持小写下划线**。

---

## 三、什么放这里、什么不放（关键）

| 代码性质 | 归入位置 |
|---|---|
| 课堂练习、课后作业、随堂实操（任意课程） | ✅ `course/课程名/` |
| 数据结构 / 算法课的**实验与实验报告** | → `algorithm/course_exp/` |
| 自己看教程跟着写的小 Demo（非课程作业） | → `personal_demos/` |
| 课设、期末大作业、团队项目（有完整架构） | → `projects/course_design_项目名称/` |
| 刷题代码（LeetCode / 牛客 / PTA） | → `algorithm/leetcode` 等平台目录 |
| 安装包、JDK、SDK、课件 PPT、教材 PDF | → `D:\develop\`（或根本不放进来） |

**「完整架构」是分界线**：

- 只有几个 `.c` / `.py` 单文件、跑完就结束 → `course/`
- 一旦出现 `src/` `res/` `pom.xml` `package.json` 这种工程结构、需要长期维护 → `projects/`

---

## 四、存放规范（强制遵守）

1. **只放源码文件**：`.c` / `.cpp` / `.java` / `.py` / `.sql` / `.html` / `.css` / `.js` 及必要的测试数据
2. **禁止存放**：课件 PPT、教材 PDF、题解视频、安装包、压缩包、SDK、运行环境、大型资源文件、IDE 工程缓存（`__pycache__/`、`.idea/`、`target/`）
3. **命名统一**：文件夹与文件一律小写 + 下划线，无中文、无空格、无特殊符号（Java 文件名例外）
   - 若老师要求提交中文名文件（如「第3章作业-张三.zip」），**归档用英文名、提交时另存中文名副本**，归档目录不放中文名副本
4. **一门课只建一个文件夹**：不要建 `java_homework`、`java_lab` 这类并列文件夹，统一收进 `java/` 内，用子目录区分类型
5. **不按学期建目录**：学期会变、课程不变。按课程归类才能沉淀，将来查「我数据库课写过什么」可以一步到位
6. **交完作业不删除**：这些代码是以后复习、面试自证学习经历的原始材料，删了等于白写

---

## 五、日常使用流程

1. 写完一次课堂练习 / 课后作业
2. 放入对应课程的章节文件夹（文件少时可平铺在课程文件夹下）
3. 取一个能看懂的名字（`ch04_queue_array.c`，而不是 `test2.c`、`新建文件.c`）
4. 结束 —— 本目录不要求写 README、不要求保持可编译工程，**归档清楚即可**

---

## 六、对照速查

```
课堂练习 | course/java/ch02_oop_basic/StudentScore.java
实验报告 | algorithm/course_exp/exp01_sort_algorithm/{src,res,report}
自学练手 | personal_demos/vue_basic_demo/
课设项目 | projects/course_design_stu_fms/{src,res,report}
刷题     | algorithm/leetcode/0001_two_sum/solution.py
环境工具 | D:/develop/
```
