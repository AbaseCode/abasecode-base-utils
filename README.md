# About
AbaseCode open source project is a set of open source collection . Including the base package , toolkit , security package , token package , payment package , excel package and so on.

Open source project components to do out of the box, to facilitate more developers to save duplication of work, more focused on business logic code writing.

I am Jon, a developer who focuses on learning and spreading technical knowledge. I hope these toolkits can help you, and welcome any friends to join this open source project.

project homepage : https://abasecode.com

project github : https://github.com/abasecode

Jon's blog : https://jon.wiki

e-mail: ijonso123@gmail.com

# About abasecode-base-utils
abasecode-base-code is a standard tool library that contains commonly used utils classes, and it will continue to integrate more available tools.

# Quick Start
## Step 1: setting the pom.xml add dependency
```
<dependency>
    <groupId>com.abasecode.opencode</groupId>
    <artifactId>abasecode-base-utils</artifactId>
    <version>1.0.3</version>
</dependency>
```

## Step 2 : No more step. Enjoy it.

# Utils list

## Factory
### YamlPropertySourceFactory
om.abasecode.opencode.base.factory.YamlPropertySourceFactory

This is a yml configuration file configuration factory.
## Generator
### IdGenerator
com.abasecode.opencode.base.generator.IdGenerator

Distributed ID generator, modified based on the snowflake algorithm.
## Toolkit
### OssHandler
com.abasecode.opencode.base.toolkit.oss.OssHandler

AliCloud OSS generates stsToken for front-end use based on STS approach. Just configure the relevant parameters.
### UploadHandler
com.abasecode.opencode.base.toolkit.upload.UploadHandler

File and image upload tool class based on Aliyun OSS.
Image supports text watermark and image watermark. The watermark supports 9 kinds of arrangement.

### QrCodeHandler
com.abasecode.opencode.base.toolkit.qrcode

QR code generation, read into text.

## Util

### CodeCopyUtils
com.abasecode.opencode.base.util.CodeCopyUtils

Secondary wrapper around BeanUtils.copyProperties to resolve null copies.
### CodeDateTimeUtils
com.abasecode.opencode.base.util.CodeDateTimeUtils

Function: Date formatting tool.
### CodeFileUtils
com.abasecode.opencode.base.util.

Read a file as bytecode or InputStream.
### CodeHttpUtils
com.abasecode.opencode.base.util.CodeHttpUtils

Get the basic information of http requests.
### CodeListUtils
com.abasecode.opencode.base.util.CodeListUtils

Comparison and sorting of lists.
### CodeMapUtils
com.abasecode.opencode.base.util.

Function: Map and class conversion (single-level, multi-level); Map fetching.
### CodeMoneyUtils
com.abasecode.opencode.base.util.CodeMoneyUtils

Convert RMB, cents to dollars, dollars to cents, numbers for rounding to RMB.

### CodeStringUtils
com.abasecode.opencode.base.util.CodeStringUtils

String processing. ID, phone number privacy processing, etc.