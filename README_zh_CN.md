# 关于AbaseCode
AbaseCode OpenCode是一套开源合集。包括基础包、工具包、安全包、token包、支付包、excel包等。

开源项目的组件做到开箱即用，方便更多的开发者节省重复的工作，更专注于业务逻辑代码编写。

我是Jon，一名全栈开发者，专注于学习和传播技术知识。希望这些工具包能够帮上你，欢迎有的朋友加入这个开源项目。

project homepage : https://abasecode.com

project github : https://github.com/abasecode

Jon's blog : https://jon.wiki

e-mail: ijonso123@gmail.com

# 关于 abasecode-base-utils
abasecode-base-utils 是常用工具合集。

# 开始使用
## Step 1: 配置 pom.xml
```
<dependency>
    <groupId>com.abasecode.opencode</groupId>
    <artifactId>abasecode-base-utils</artifactId>
    <version>1.0.3</version>
</dependency>
```
## Step 2： 完成

# 工具列表
## Factory
### YamlPropertySourceFactory
完整地址： com.abasecode.opencode.base.factory.YamlPropertySourceFactory

作用：这个是yml配置文件配置工厂。
## Generator
### IdGenerator
完整地址： com.abasecode.opencode.base.generator.IdGenerator

作用：
分布式ID生成器，基于雪花算法修改。
## Toolkit
### OssHandler
完整地址： com.abasecode.opencode.base.toolkit.oss.OssHandler

作用：
阿里云OSS基于STS方式生成stsToken给前端使用。只要配置相关参数即可。
### UploadHandler
完整地址： com.abasecode.opencode.base.toolkit.upload.UploadHandler

作用：
基于阿里云OSS的文件和图片上传工具类。
图片支持文本水印和图片水印。水印支持9种排列方式。

### QrCodeHandler
完整地址： com.abasecode.opencode.base.toolkit.qrcode

作用：
二维码生成，读取成文本。

## Util

### CodeCopyUtils
完整地址: com.abasecode.opencode.base.util.CodeCopyUtils

作用：
二次封装BeanUtils.copyProperties，解决null拷贝。
### CodeDateTimeUtils
完整地址： com.abasecode.opencode.base.util.CodeDateTimeUtils

作用：日期格式化工具。
### CodeFileUtils
完整地址： com.abasecode.opencode.base.util.CodeFileUtils

作用：读取文件为字节码或者InputStream。
### CodeHttpUtils
完整地址： com.abasecode.opencode.base.util.CodeHttpUtils

作用：获取http请求的基本信息。
### CodeListUtils
完整地址： com.abasecode.opencode.base.util.CodeListUtils

作用：List的比较和排序。
### CodeMapUtils
完整地址： com.abasecode.opencode.base.util.CodeMapUtils

作用：Map与类的转换（单层，多层）；Map的取值。
### CodeMoneyUtils
完整地址： com.abasecode.opencode.base.util.CodeMoneyUtils

作用：人民币的转换，分转元，元转分，数字进行四舍五入转人民币。

### CodeStringUtils
完整地址： com.abasecode.opencode.base.util.CodeStringUtils

作用：字符串处理。身份证，手机号隐私处理等。