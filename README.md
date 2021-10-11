### 第一步：项目跟目录下，拉去代码

git submodule add https://github.com/YXY1109/GitSubModuleCommon.git

### 第二步：将目录形式改为module

setting.gradle 添加：include ':GitSubModuleCommon'

### 第三步：引入工程中
File->Project Structure->Dependencies


