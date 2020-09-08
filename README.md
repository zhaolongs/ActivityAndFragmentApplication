# ActivityAndFragmentApplication
Android中Activity与Fragment数据传递Demo代码



Activity 与 Fragment 之间进行数据传递是，在Activity中将要传递的数据封装在 Bundle中，然后在 Activity 中使用 Fragment 的实例通过 setArgument(Bundel bundel) 方法绑定传递，在要传递到的Fragment中 使用this.getArgment(),得到传递到的Bundle，从而获取到传递。

  |[**github?**](https://github.com/zhaolongs) |[本文章涉及的测试源码](https://github.com/zhaolongs/ActivityAndFragmentApplication)   |  [百度同步](https://baijiahao.baidu.com/builder/preview/s?id=1676587101499079482) |
|--|--|--|
| [CSDN](https://biglead.blog.csdn.net/)| [网易云课堂教程](https://study.163.com/instructor/1021406098.htm)  | [掘金](https://juejin.im/user/712139263459176)| [EDU学院教程](https://edu.csdn.net/lecturer/1555)  |
| [知乎](https://www.zhihu.com/people/zhao-long-90-89/posts)| [Flutter系列文章 ](https://blog.csdn.net/zl18603543572/article/details/93532582)  |[头条同步](https://www.toutiao.com/i6867301274614759948/)  



![在这里插入图片描述](https://img-blog.csdnimg.cn/20200908125151416.png?x-oss-process=image/watermark,type_ZmFuZ3poZW5naGVpdGk,shadow_10,text_aHR0cHM6Ly9ibG9nLmNzZG4ubmV0L3psMTg2MDM1NDM1NzI=,size_16,color_FFFFFF,t_70#pic_center)