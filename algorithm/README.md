# algorithm 使用规则

> 本目录用于归档**数据结构与算法练习、刷题代码、算法实验与算法作业源码**。
> 属于 `D:\code\` 的四大子目录之一，命名、存放规则同时受 `D:\code\README.md` 约束（小写下划线、无中文、无空格、无特殊符号）。
> **二级目录按需创建**：下面列出的 `leetcode/`、`nowcoder/` 等文件夹不需要提前建好，用到哪个建哪个（当前 `algorithm/` 下只有本说明文档，属正常状态）。

---

## 一、目录结构

```
algorithm/
├── README.md          本使用规则文档
├── leetcode/          力扣 LeetCode 题目代码
├── nowcoder/          牛客网（含校招真题、专项练习、竞赛）代码
├── pta/               PTA 拼题A（含数据结构/算法题目集）代码
├── course_exp/        算法课程实验 & 算法作业源码
└── template/          常用算法模板（可复用的代码骨架）
```

平台目录按「哪个平台刷的」划分；`course_exp/` 按「哪门课的实验/作业」划分；`template/` 只放可复用模板，不放具体题目。

> **空的二级目录不必提前创建**：`leetcode/`、`nowcoder/`、`pta/`、`course_exp/`、`template/` 都属于**按需创建**——第一次用到哪个平台/哪门课的实验时，再在 `algorithm/` 下建对应文件夹即可。空文件夹里没有任何内容，提前建了纯属摆设。

---

## 二、核心规则：一题一目录

平台目录（`leetcode/` `nowcoder/` `pta/`）下**默认扁平存放，一道题一个独立文件夹**，禁止把多题堆在同一个文件里。

### 1. 题目目录命名格式

```
题号_英文短名
```

- **题号**：统一 **4 位补零**（不足 4 位前面补 `0`），如 `1` → `0001`、`88` → `0088`、`1024` → `1024`
- **英文短名**：题目英文名或核心考点，全小写 + 下划线，2~4 个单词以内
- 无题号的（如牛客某些自命题、PTA 章节题）用**序号或考点**代替题号，如 `nc_01_...`、`pta_03_...`

✅ 正确示例

```
leetcode/0001_two_sum/
leetcode/0146_lru_cache/
leetcode/0206_reverse_linked_list/
nowcoder/nc_01_merge_intervals/
pta/pta_03_binary_search/
```

❌ 错误示例

```
leetcode/1. 两数之和.java          ← 中文 + 空格 + 点号
leetcode/two_sum.py                ← 缺题号
leetcode/0001_two_sum_and_0002.py  ← 多题合并
leetcode/TwoSum/                   ← 未小写、驼峰
```

### 2. 单个题目目录内部结构

```
0001_two_sum/
├── solution.py          主解法（语言按自己习惯：.py / .java / .c / .cpp）
├── solution_2.py        可选：第二种解法（后缀写清思路，如 solution_hash.py）
├── note.md              思路笔记（强烈建议写，格式见下）
└── input.txt            可选：测试输入数据（小文件）
```

多解法命名后缀用**解法关键词**：`solution_binary_search.py`、`solution_dp.java`，不要用 `solution_new.py` / `solution_final.py` / `solution2.py` 这类无法辨识的命名。

### 3. note.md 固定模板（复制使用）

```markdown
# 1. Two Sum 两数之和

- 平台/题号：leetcode 1
- 难度：easy
- 标签：array, hash_table
- 状态：solved            <!-- unsolved / solved / review -->
- 日期：2026-09-21
- 复杂度：时间 O(n)，空间 O(n)

## 思路
一遍哈希：遍历时先查 target - nums[i] 是否在表中，不在则把当前值入表。

## 踩坑 / 复习点
- 要先查后插，避免把自己和自己配对。
- 返回下标不是返回值，别写混。
```

**`状态` 字段是复习抓手**：写 `review` 的题目，就是下次刷题时要优先重做的题。

---

## 三、`course_exp/` 算法实验与作业

面向「数据结构」「算法设计与分析」等课程的实验、算法作业源码，按实验/作业分组：

```
course_exp/
├── exp01_sort_algorithm/
│   ├── src/             实验源代码
│   ├── res/             测试数据、图表数据、SQL 等资源
│   └── report/          实验报告、作业文档
├── exp02_graph_search/
└── homework01_greedy/
```

命名格式：`exp01_实验英文短名` / `homework01_主题英文短名`，序号两位补零。

**与 `D:\code\course\` 的边界（重要）**

| 情况 | 归入 |
|---|---|
| 数据结构 / 算法设计与分析课的实验、算法作业 | `algorithm/course_exp/` |
| 其他课程的随堂练习、课后小作业（如 Java 基础、数据库练习） | `D:\code\course\` |
| 算法竞赛集训、ACM 训练题 | 对应平台目录，如 `algorithm/nowcoder/` |

---

## 四、`template/` 算法模板

只放**可复用、非具体题目**的代码骨架，命名 `算法名.语言后缀`：

```
template/
├── quick_sort.cpp
├── binary_search.cpp
├── union_find.cpp
├── kmp.cpp
├── segment_tree.cpp
└── dijkstra.cpp
```

规则：
- 每个模板文件顶部必须有注释块：用途、时间复杂度、空间复杂度、调用示例
- 模板必须是**可直接复制到题目代码里能跑**的完整函数/类，不要留半成品
- 模板更新就地覆盖，不建 `quick_sort_v2` 之类的版本文件（确实要留旧版本，就另存到归档目录之外）

---

## 五、通用存放规范（强制遵守）

1. **全部小写下划线命名**：目录、文件一致；无中文、无空格、无特殊符号
2. **只放源码**：`.c` / `.cpp` / `.java` / `.py` / `.sql` / `.md` 及必要的测试数据
3. **禁止存放**：算法教材、PDF 讲义、题解视频、安装包、压缩包、IDE 工程缓存（`target/`、`.idea/`、`__pycache__/`）
4. **题解只写自己的话**：`note.md` 记录自己的思路和踩坑，不要把网上的长篇题解整段复制进来
5. **一份代码只存一处**：同一道题在多个平台做过，以首次完成的平台为准，其他平台用 `note.md` 里的「同类题」字段交叉引用，不重复建目录
6. **可运行优先**：每个解法文件应能独立跑通（LeetCode 的 `Solution` 类 / 函数式写法均可），不依赖本地私有框架
7. **与项目代码区分**：刷题代码不进 `D:\code\projects\`，项目里的算法实现也不搬到这里

---

## 六、日常使用流程（建议）

1. **开新题**：在对应平台目录下建 `题号_英文短名/` 文件夹
2. **写解法**：`solution.py`（或对应语言），一次提交对应一次「先自己想」的记录
3. **写笔记**：复制上面的 `note.md` 模板，填思路、复杂度、踩坑，标 `状态`
4. **复习**：只看 `note.md` 的「思路」和「复习点」自测，做不出来就把状态改成 `review`，隔几天重做
5. **提炼模板**：反复用到的写法，提炼进 `template/`，下次直接复用

---

## 七、填写示例（照此格式建你自己的第一道题）

```
algorithm/leetcode/0001_two_sum/
├── solution.py          主解法
└── note.md              思路笔记
```

`note.md` 按第二节模板填写，示例：

```markdown
# 1. Two Sum 两数之和

- 平台/题号：leetcode 1
- 难度：easy
- 标签：array, hash_table
- 状态：solved
- 日期：2026-09-21
- 复杂度：时间 O(n)，空间 O(n)

## 思路
一遍哈希：遍历时先查 target - nums[i] 是否在表中，不在则把当前值入表。

## 踩坑 / 复习点
- 要先查后插，避免元素和自己配对。
- 返回的是下标不是数值。

## 同类题
- leetcode 167 两数之和 II（有序数组，双指针）
```

