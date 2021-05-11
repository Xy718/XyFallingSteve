# XyFallingSteve
一个简单的基于SpongeAPI的可配置权限的支持多世界的开源的有很多的的控制玩家掉落伤害的服务器的插件

SpongeAPI：7.2.0

## 编译
Windows
```shell
./gradlew build
```
Linux
```shell
gradle build
```
输出到文件夹：
`build/libs/*`
## 安装
复制到服务器mods文件夹下即可，无配置文件

## 如何使用

本插件基于玩家的Metadata来控制玩家时候在受到跌落伤害时拥有该世界的跌落保护权限

metadata key value：
`xyfs.<world_name> 1`

`world_name`为世界名，可以使用`/worlds`指令查看当前服务器的所有世界
`1`为metadata的值，无所谓，随便给

如果你使用LuckPerms作为服务器的权限管理插件，只需要使用：
```shell
/lp user VIP_USER meta set xyfs.kkp 1
/lp user VIP_USER meta set xyfs.kkjb 1
```
来给予某玩家kkp和kkjb世界的免跌落伤害权限

如果你要去掉某玩家的某世界的该权限，只需要
```shell
/lp user VIP_USER meta unset xyfs.kkp
```
即可