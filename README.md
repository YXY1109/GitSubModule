### 第一步：项目跟目录下，拉去代码

git submodule add https://github.com/YXY1109/GitSubModuleCommon.git

### 第二步：将目录形式改为module

setting.gradle 添加：include ':GitSubModuleCommon'

### 第三步：引入工程中

File->Project Structure->Dependencies

### 更新代码，指定更新的名称

git submodule update --remote GitSubModuleCommon

### 修改维护代码，通过另外一个仓库单独维护，方便管理，写独立的测试


