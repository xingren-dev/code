# projects 使用规则

> 本目录是 `D:\code\` 的四大子目录之一，也是**核心项目归档目录**，用于存放所有课程设计、期末大作业、团队项目、竞赛小项目等**具备完整架构的正式项目**。
> 定位一句话：**能被当成作品展示、需要长期维护的完整代码放这里**。
> 通用约束仍受 `D:\code\README.md` 管理（小写下划线、无中文、无空格、无特殊符号）。

---

## 一、什么属于这里

✅ 属于 `projects/`：

- 课程设计、期末大作业（前后端分离项目、管理系统、小程序等）
- 团队协作项目、竞赛参赛作品
- 简历项目、准备作为作品展示的完整项目
- 由 `personal_demos/` 试水成功、决定做大做完整的小项目

❌ 不属于这里：

| 情况 | 正确去处 |
|---|---|
| 单文件、无架构的课程练习 | `course/课程名/` |
| 自学试水、跑通即止的 Demo | `personal_demos/` |
| 算法实验、算法作业 | `algorithm/course_exp/` |
| 刷题代码 | `algorithm/leetcode` 等平台目录 |

**「完整架构」是唯一分界线**：有 `src/`、有依赖配置文件、有模块划分、要按文档才能跑起来 → `projects/`。

---

## 二、命名格式

```
course_design_项目名称
```

- 全部小写 + 下划线，项目名称用**英文或拼音缩写**，不用中文
- 课设统一用 `course_design_` 前缀，一眼能看出是课设归档

✅ 正确示例

```
projects/course_design_stu_fms/          学生学籍管理系统（课设）
projects/course_design_library_sys/      图书管理系统（课设）
projects/course_design_blog_platform/    博客平台（课设）
projects/graduation_project_grad_sys/    毕业设计（非课设，用此前缀）
```

❌ 错误示例

```
projects/学生管理系统/            ← 中文
projects/CourseDesign/            ← 驼峰、无含义
projects/项目1/                   ← 中文 + 无信息量
projects/2026_spring/course_design_stu_fms/   ← 多套了一层学期目录
```

**禁止在 `projects/` 下再按学期、课程分层**（如 `2026_spring/`、`web_project/`），所有项目**扁平排列**——归档看重一秒钟能定位到项目。

> 非课设的完整项目（竞赛、团队、个人作品、**毕业设计**）可另起前缀，如 `contest_xxx`、`team_xxx`、`graduation_project_xxx`，方便区分来源；**课设必须用 `course_design_`，毕业设计用 `graduation_project_`**。

---

## 三、单个项目内部结构（统一三件套）

```
projects/course_design_stu_fms/
├── README.md        项目说明文档（必须有，见下）
├── src/             项目全部源代码
├── res/             项目资源文件、SQL 脚本、配置文件、静态素材
└── report/          对应课设报告、项目文档、答辩资料
```

### 1. `src/` —— 全部源代码

前后端分离项目按端拆分：

```
src/
├── backend/         Spring Boot 后端源码
└── frontend/        Vue 2 前端源码
```

- 放**源码本身**，不放 `target/`、`dist/`、`node_modules/`、`.idea/` 等构建与缓存产物
- 若为团队协作，`src/` 内按模块划分即可，不要在 `src/` 里再塞文档

### 2. `res/` —— 资源、脚本、配置

```
res/
├── sql/            建表语句、初始化数据脚本（schema.sql、init_data.sql）
├── config/         配置模板（不能含真实密码，见「安全」一节）
└── static/         图片、图标、字体等静态素材
```

- SQL 脚本必须**完整可执行**：别人按顺序跑完就能建出和你一样的库
- 大文件（>10MB 的视频、安装包、数据导出）**不允许放入**，需要就写清下载来源或使用网盘

### 3. `report/` —— 报告与答辩资料

```
report/
├── 01_proposal.docx          开题报告
├── 02_midterm_report.docx    中期报告
├── 03_final_report.docx      结题 / 课设报告
├── 04_defense_slides.pptx    答辩 PPT
├── 05_demo_video_link.md     演示视频链接（视频文件本身不放入归档目录）
└── 06_grade_feedback.md      成绩与评语（可选，很有价值）
```

- 文件用**英文序号 + 英文名**命名，文档**内容**照常用中文
- 序号保证按时间/流程排序，一眼看出报告演进顺序

#### 归档名 vs 提交名（重要）

学校/老师提交作业时通常要求中文文件名（如「课设报告-张三.docx」「学生管理系统答辩PPT.pptx」），这与归档规范会冲突。处理方式固定为：

- **归档用英文名**：`report/` 内始终是 `03_final_report.docx` 这类英文序号命名，规则不因提交要求而改变
- **提交时另存中文名副本**：需要交作业时，把报告**另存为一份中文名文件**放到提交用的位置（桌面临时文件夹 / 学习通 / 老师指定的收集目录），**不要放回 `report/`**
- **报告内容不变**：同一份内容两种文件名，标题页、封面照常写中文
- 迭代时**只改 `report/` 里的英文名母版**，下次提交再另存新副本，避免出现「中文名副本改了三版、母版还是旧的」

> 一句话：`report/` 是母版存放处，中文名文件是"出厂包装"，包装不回收进这里。

### 4. `README.md` —— 项目说明（必须有）

每个项目根目录都要有 `README.md`，建议包含：

```markdown
# 学生学籍管理系统（stu_fms）

## 项目简介
课程设计项目，实现学生信息录入、查询、班级管理等核心功能。

## 技术栈
- 前端：Vue 2 + Element UI
- 后端：Spring Boot 2.3.3 + MyBatis
- 数据库：MySQL 8.0

## 环境要求
JDK 8、Node 22、Maven 3.9、MySQL 8.0

## 启动步骤
1. 执行 res/sql/schema.sql 与 init_data.sql 建库
2. 复制 res/config/application.example.yml 为 application.yml，填入本地数据库密码
3. 后端：mvn spring-boot:run（端口 8080）
4. 前端：npm install && npm run serve（端口 8081）

## 默认账号
管理员 admin / 123456

## 分工与进度
- 张三：后端接口 + 数据库设计
- 李四：前端页面 + 联调

## 已知问题
- 导出 Excel 在数据量超 1000 行时偶发超时
```

**判断标准**：换一台干净电脑，只看这份 README 能不能把项目跑起来。不能，就说明写得不够。

---

## 四、存放规范（强制遵守）

1. **一个项目一个文件夹**，项目内三件套齐全，不拆分存放（代码 + 报告 + 资源必须同处一室）
2. **只放源码、配置模板、小体积资源与文档**；禁止 `node_modules/`、`venv/`、`target/`、`dist/`、`.idea/`、`__pycache__/`、jar 包、安装包、IDE 工程缓存
3. **依赖靠清单复原**：前端 `package.json`、后端 `pom.xml` / `requirements.txt` 必须在，换电脑后按清单重新安装依赖即可复原
4. **命名统一**：文件夹与文件小写 + 下划线（框架强制命名的除外，如 `package.json`、`index.html`、Spring Boot 的 `Application.java`）
5. **安全**：`res/config/` 只放 `*.example.*` 模板，**真实数据库密码、密钥、token 不要写进 `res/` 目录**；本地真实配置只留在后端工程的 `src/main/resources/application.yaml` 中，不要复制到归档资源目录
6. **报告与代码同步归档**：期末提交前完成 `report/` 归位，不要出现「代码在这、报告在桌面」的情况
7. **答辩结束后冻结不删**：这是简历项目来源与能力证明，删了就白做

---

## 五、提交 / 答辩前自检清单

- [ ] `src/` 里没有 `target/`、`node_modules/`、`.idea/` 等缓存
- [ ] `res/sql/` 脚本能在空库上完整执行出一套可用数据
- [ ] `res/config/` 里没有真实密码，只留 `*.example.*`
- [ ] `report/` 含最终报告 + 答辩 PPT，文件按序号命名
- [ ] 归档报告是英文名母版，提交副本用的是中文名且未混入 `report/`
- [ ] 根目录 `README.md` 里的启动步骤自己照着走过一遍
- [ ] `src/` 里没有留 `test.java`、`新建文本文档.txt` 这类临时文件
- [ ] 项目名符合 `course_design_项目名称`（课设）或 `graduation_project_项目名称`（毕业设计）格式

---

## 六、对照速查

```
完整课设  | projects/course_design_stu_fms/{src,res,report}
        |   src/{backend,frontend}
        |   res/{sql,config,static}
        |   report/01_proposal.docx …
课堂练习  | course/java/ch02_oop_basic/
自学试水  | personal_demos/vue2_admin_demo/
算法实验  | algorithm/course_exp/exp01_sort_algorithm/
刷题      | algorithm/leetcode/0001_two_sum/solution.py
环境工具  | D:/develop/
```
