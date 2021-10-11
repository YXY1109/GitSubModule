### 创建项目，实现module

只需要提交module下的文件

## 垃取module作为子模块

### 第一步：项目跟目录下，拉去代码

git submodule add https://github.com/YXY1109/GitSubModuleCommon.git

### 第二步：将目录形式改为module

setting.gradle 添加：include ':GitSubModuleCommon'

### 第三步：引入工程中

File->Project Structure->Dependencies

### 更新代码，指定更新的名称

git submodule update --remote GitSubModuleCommon

#### 主项目的代码是一个仓库地址，子模块的是另外一个仓库地址，可以在一个项目中分开单独开发维护

#### 不在需要第一个项目了




