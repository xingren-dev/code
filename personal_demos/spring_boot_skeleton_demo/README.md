# spring_boot_skeleton_demo

- 学什么：从零搭一套「通用后台骨架」——登录 + 权限 + 增删改查 + 分页搜索 + 一条业务规则
- 来源：`D:\学习资料\JavaWeb+AI` 第 40-152 讲
- 日期：2026-09-23
- 状态：doing（尚未开工，等 JavaSE 学完再启动）
- 备注：这是 L3 的练手项目，**练熟后 11 月定题的毕设直接换表换规则即可**

## 为什么练这个

毕设九成以上是"某某信息管理系统"，骨架完全一样。你把骨架练熟，题目一到手，只剩三件事：设计表、写业务规则、写论文。

## 规格（就按这个做，不要加功能）

**三张表**

| 表 | 字段 |
|---|---|
| `user` | id、username、password（BCrypt）、nickname、role、create_time |
| `item` | id、name、stock、price、create_time |
| `record` | id、item_id、user_id、count、type、create_time |

**11 个接口**

1. 登录
2. 查询当前登录用户
3. 退出登录
4. 用户列表（分页 + 搜索）
5. 新增用户
6. 修改用户
7. 删除用户
8. 物品列表
9. 新增物品
10. 修改物品
11. 出库

**一条核心业务规则**

> 出库时必须在**同一个事务**里同时完成"扣库存"和"写记录"；库存不足直接拒绝。

这条是全项目的精华。答辩最爱问的就是「两个人同时扣库存会怎样」——你在这里练过，就答得上。

**验收重点：越权校验**

普通用户登录后，不光前端看不到"用户管理"菜单，**直接用 Postman 调那个接口也必须被拒绝**。很多同学只做前端隐藏，这是答辩的典型失分点。

## 目录结构（按 `projects/` 规范搭，将来好搬）

```
spring_boot_skeleton_demo/
├── README.md
├── src/
│   ├── backend/      Spring Boot 3.3.x 后端
│   └── frontend/     Vue3 + Element Plus 前端
└── res/
    └── sql/          schema.sql、init_data.sql
```

## 技术栈

- 后端：Spring Boot 3.3.x + JDK 21 + MyBatis-Plus + BCrypt + JWT 拦截器
- 前端：Vite + Vue3 + Element Plus + axios
- 数据库：MySQL 8.0

## 完成后怎么处理

骨架跑通、11 个接口全通、权限校验生效之后：**整体搬到 `D:\code\projects\graduation_project_项目名称\`**，补齐 `report/` 三件套，作为毕设的起点。
