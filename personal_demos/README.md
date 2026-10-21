# personal_demos 使用规则

> 本目录是 `D:\code\` 的四大子目录之一，用于存放**自主学习、课余练习、自学技术的小型测试案例与功能 Demo**。
> 定位一句话：**不是课堂作业、不是正式课设，纯个人练手、技术试水的代码放这里**。
> 通用约束仍受 `D:\code\README.md` 管理（小写下划线、无中文、无空格、无特殊符号）。

---

## 一、什么属于这里

✅ 属于 `personal_demos/`：

- 新语法、新特性测试（`python_async_demo/`、`java_stream_api/`）
- 功能小尝试（`js_drag_drop_demo/`、`canvas_chart_demo/`）
- 第三方库 / 框架使用测试（`axios_request_demo/`、`mybatis_plus_demo/`）
- 跟着教程视频敲的案例（`vue2_admin_demo/`、`spring_boot_hello/`）
- 自学技术路线的试水代码（爬虫、小脚本、命令行工具）

❌ 不属于这里：

| 情况 | 正确去处 |
|---|---|
| 课程作业、课堂练习 | `course/课程名/` |
| 数据结构 / 算法课的实验 | `algorithm/course_exp/` |
| 刷题代码 | `algorithm/leetcode` 等平台目录 |
| 具备完整架构、需要长期维护的项目 | `projects/course_design_项目名称/` |
| 安装包、SDK、环境工具 | `D:\develop/` |

---

## 二、目录结构

### 1. 一个 Demo 一个文件夹，扁平存放

```
personal_demos/
├── vue2_admin_demo/
├── python_spider_weather/
├── java_stream_api/
├── js_drag_drop_demo/
└── spring_boot_hello/
```

**不要在 `personal_demos/` 下再按学期或时间分层**（如 `2026_09/`、`term3/`），Demo 数量多时按**技术栈**分层即可：

```
personal_demos/
├── frontend/
│   ├── vue2_admin_demo/
│   └── js_drag_drop_demo/
├── backend/
│   └── spring_boot_hello/
└── python/
    └── python_spider_weather/
```

### 2. 命名格式

```
技术栈_主题_类型
```

- 全小写 + 下划线，能一眼看出「用什么技术、做什么」
- ✅ `vue2_admin_demo`、`python_spider_weather`、`js_canvas_chart`
- ❌ `demo1`、`test`、`新建文件夹`、`我的练手`、`vueStudy`

### 3. 单个 Demo 内部结构（**轻量，不强求统一**）

Demo 的价值是「快速验证」，所以**不需要照搬 `projects/` 的 `src/ res/ report/` 三件套**。推荐最小结构：

```
vue2_admin_demo/
├── README.md        推荐填写（见下）
├── package.json     该技术栈的原生入口文件
└── src/             （如果框架本身要求）
```

**`README.md` 建议内容（三五行即可，不用长篇）**：

```markdown
# vue2 admin demo

- 学什么：Vue2 + Element UI 搭建后台管理页
- 来源：B站《xxx》第 12-25 集
- 日期：2026-09-21
- 状态：done        <!-- doing / done / abandoned -->
- 备注：路由守卫没跑通，其余正常
```

`状态` 字段很重要：写 `doing` 的是待续坑，写 `abandoned` 的能让你以后不再重踩同一个坑，也不用纠结要不要继续。

---

## 三、存放规范（强制遵守）

1. **只放源码与配置**：`.c` / `.java` / `.py` / `.html` / `.css` / `.js` / `.vue` / `.sql` 及项目自身的配置文件
2. **禁止存放**：`node_modules/`、`venv/`、`target/`、`dist/`、`.idea/`、`.vscode/`、`__pycache__/`、下载的 jar 包、教程视频、安装包
3. **依赖不入归档**：不要把 `node_modules/`、`venv/` 等依赖目录复制进归档文件夹；换电脑后用 `npm install` / `pip install -r requirements.txt` 复原即可
4. **命名统一**：文件夹与文件小写 + 下划线，无中文、无空格、无特殊符号（个别框架强制的文件名除外，如 `package.json`、`index.html`）
5. **允许半成品**：Demo 本来就是试验田，跑通 60% 也可以留档，但要在 `README.md` 里写清卡在哪
6. **不重复建目录**：同一个技术的多个小试验，尽量合并进一个 Demo 文件夹，别建 `es6_test1`、`es6_test2`、`es6_test3`

---

## 四、生命周期：什么时候搬走

Demo 是有出口的，别让它永远是半成品：

| 情况 | 动作 |
|---|---|
| 试水成功，想做成完整项目 | **移动到 `projects/`**，按 `course_design_项目名称` 命名，补齐 `src/ res/ report/` 三件套 |
| 试水失败或已过时 | 保留，把 `README.md` 状态改为 `abandoned`，写清原因；不要删除 |
| 逐渐变成每天在用的工具脚本 | 若具备完整功能，同样按项目规范搬到 `projects/` |
| 是算法相关 | 搬到 `algorithm/` 对应平台或 `course_exp/` |

**判断标准**：只要它在「持续维护、有多个模块、要给别人看」，就该进 `projects/`；只是「验证一个想法」就留在 `personal_demos/`。

---

## 五、日常使用流程

1. 想试一个新东西 → 建 `技术栈_主题_类型/` 文件夹
2. 写代码，随便跑，能验证想法即可
3. 写三行 `README.md`：学什么、来源、状态
4. 收尾时对照上面的「生命周期」判断：留在这、搬去 `projects/`、还是标记 `abandoned`

---

## 六、对照速查

```
课堂练习  | course/java/ch02_oop_basic/
自学试水  | personal_demos/vue2_admin_demo/
正式项目  | projects/course_design_stu_fms/{src,res,report}
算法实验  | algorithm/course_exp/exp01_sort_algorithm/
刷题      | algorithm/leetcode/0001_two_sum/solution.py
环境工具  | D:/develop/
```
