package com.jiac.ktmvp.mvp.model.entity;

import java.util.List;

/**
 * 类       名:
 * 说       明:
 * 修 改 记 录:
 * 版 权 所 有:   Copyright © 2017
 * 公       司:   深圳市深电能售电有限公司
 * version   0.1
 * date   2018/9/10 14:23
 * author   caojiaxu
 */
public class HomeEntity extends BaseJson<HomeEntity> {

        /**
         * curPage : 1
         * datas : [{"apkLink":"","author":"默非静语","chapterId":249,"chapterName":"干货资源","collect":false,"courseId":13,"desc":"","envelopePic":"","fresh":true,"id":3374,"link":"https://www.jianshu.com/p/44a4a1c32b4f","niceDate":"15小时前","origin":"","projectLink":"","publishTime":1536505697000,"superChapterId":249,"superChapterName":"干货资源","tags":[],"title":"分享一些程序员必备网站","type":0,"userId":-1,"visible":1,"zan":0},{"apkLink":"","author":"浪淘沙xud","chapterId":60,"chapterName":"Android Studio相关","collect":false,"courseId":13,"desc":"","envelopePic":"","fresh":true,"id":3373,"link":"https://www.jianshu.com/p/88e32ef66ef2","niceDate":"15小时前","origin":"","projectLink":"","publishTime":1536505616000,"superChapterId":60,"superChapterName":"开发环境","tags":[],"title":"Android 技能图谱学习路线","type":0,"userId":-1,"visible":1,"zan":0},{"apkLink":"","author":"浪淘沙xud","chapterId":98,"chapterName":"WebView","collect":false,"courseId":13,"desc":"","envelopePic":"","fresh":true,"id":3372,"link":"https://www.jianshu.com/p/b66c225c19e2","niceDate":"15小时前","origin":"","projectLink":"","publishTime":1536505406000,"superChapterId":98,"superChapterName":"网络访问","tags":[],"title":"Android WebView独立进程解决方案","type":0,"userId":-1,"visible":1,"zan":0},{"apkLink":"","author":"陈岗不姓陈","chapterId":99,"chapterName":"具体案例","collect":false,"courseId":13,"desc":"","envelopePic":"","fresh":true,"id":3371,"link":"https://www.jianshu.com/p/1ff14c0156b0","niceDate":"15小时前","origin":"","projectLink":"","publishTime":1536505110000,"superChapterId":134,"superChapterName":"自定义控件","tags":[],"title":"Android自定义View：关于打钩小动画的思考重构","type":0,"userId":-1,"visible":1,"zan":0},{"apkLink":"","author":"小编","chapterId":375,"chapterName":"Flutter","collect":false,"courseId":13,"desc":"","envelopePic":"","fresh":true,"id":3370,"link":"http://www.wanandroid.com/blog/show/2333","niceDate":"17小时前","origin":"","projectLink":"","publishTime":1536496316000,"superChapterId":375,"superChapterName":"跨平台","tags":[],"title":"Flutter从入门到奔溃 系列","type":0,"userId":-1,"visible":1,"zan":0},{"apkLink":"","author":" 宇宝守护神","chapterId":251,"chapterName":"OpenCV","collect":false,"courseId":13,"desc":"","envelopePic":"","fresh":true,"id":3369,"link":"https://blog.csdn.net/qq_34902522/article/details/82464516","niceDate":"18小时前","origin":"","projectLink":"","publishTime":1536495463000,"superChapterId":186,"superChapterName":"热门专题","tags":[],"title":"基于opencv实现人脸检测","type":0,"userId":-1,"visible":1,"zan":0},{"apkLink":"","author":"ChanghuiN","chapterId":364,"chapterName":"模块化","collect":false,"courseId":13,"desc":"","envelopePic":"","fresh":false,"id":3368,"link":"http://www.hchstudio.cn/article/2018/e164/","niceDate":"2天前","origin":"","projectLink":"","publishTime":1536303987000,"superChapterId":186,"superChapterName":"热门专题","tags":[],"title":"美团外卖开源路由框架 WMRouter 源码分析","type":0,"userId":-1,"visible":1,"zan":0},{"apkLink":"","author":"javalong","chapterId":169,"chapterName":"gradle","collect":false,"courseId":13,"desc":"","envelopePic":"","fresh":false,"id":3367,"link":"https://www.jianshu.com/p/d9824e1bbbb3","niceDate":"2018-09-06","origin":"","projectLink":"","publishTime":1536247919000,"superChapterId":60,"superChapterName":"开发环境","tags":[],"title":"解决Android依赖冲突","type":0,"userId":-1,"visible":1,"zan":0},{"apkLink":"","author":" prototypez","chapterId":77,"chapterName":"响应式编程","collect":false,"courseId":13,"desc":"","envelopePic":"","fresh":false,"id":3366,"link":"https://juejin.im/post/5b8f536c5188255c352d3528","niceDate":"2018-09-06","origin":"","projectLink":"","publishTime":1536247883000,"superChapterId":186,"superChapterName":"热门专题","tags":[],"title":"RxJava 沉思录（一）：你认为 RxJava 真的好用吗？","type":0,"userId":-1,"visible":1,"zan":0},{"apkLink":"","author":"chinese-poetry","chapterId":367,"chapterName":"资源聚合类","collect":false,"courseId":13,"desc":"最全中华古诗词数据库, 唐宋两朝近一万四千古诗人, 接近5.5万首唐诗加26万宋诗. 两宋时期1564位词人，21050首词。\r\n","envelopePic":"http://www.wanandroid.com/blogimgs/08dbd809-f2b2-49f7-836b-96770f8ea123.png","fresh":false,"id":3365,"link":"http://www.wanandroid.com/blog/show/2332","niceDate":"2018-09-06","origin":"","projectLink":"https://github.com/chinese-poetry/chinese-poetry","publishTime":1536246860000,"superChapterId":294,"superChapterName":"开源项目主Tab","tags":[{"name":"项目","url":"/project/list/1?cid=367"}],"title":" 最全中华古诗词数据库 chinese-poetry","type":0,"userId":-1,"visible":1,"zan":0},{"apkLink":"","author":"ljuns","chapterId":358,"chapterName":"项目基础功能","collect":false,"courseId":13,"desc":"每当测试同事发现有难以复现的 bug，苦于没有日志很难下手。这个工具可以收集 app 的 logcat 日志保存到文件，辅助分析难复现的 bug","envelopePic":"http://www.wanandroid.com/blogimgs/35c6df9c-eee9-454f-9488-d98eda3cda26.png","fresh":false,"id":3363,"link":"http://www.wanandroid.com/blog/show/2330","niceDate":"2018-09-06","origin":"","projectLink":"https://github.com/ljuns/LogCollector","publishTime":1536246785000,"superChapterId":294,"superChapterName":"开源项目主Tab","tags":[{"name":"项目","url":"/project/list/1?cid=358"}],"title":"一个收集 app 输出日志的工具","type":0,"userId":-1,"visible":1,"zan":0},{"apkLink":"","author":"CameloeAnthony","chapterId":314,"chapterName":"RV列表动效","collect":false,"courseId":13,"desc":"各种RecyclerView的效果","envelopePic":"http://www.wanandroid.com/blogimgs/1dfb4db5-77b9-4053-9ad6-46b98a39c419.png","fresh":false,"id":3361,"link":"http://www.wanandroid.com/blog/show/2328","niceDate":"2018-09-06","origin":"","projectLink":"https://github.com/CameloeAnthony/Learning-RecyclerView","publishTime":1536246702000,"superChapterId":294,"superChapterName":"开源项目主Tab","tags":[{"name":"项目","url":"/project/list/1?cid=314"}],"title":"RecyclerView的集合 Learning-RecyclerView","type":0,"userId":-1,"visible":1,"zan":0},{"apkLink":"","author":"sorgs","chapterId":358,"chapterName":"项目基础功能","collect":false,"courseId":13,"desc":"涉及到一个签到的步骤view\r\n\r\n需求：以七天为周天，执行当天签到需要一个动画效果；签到前灰色，签到后变为绿色；每天加的分数不一定，第三天和第七天加的比较多，分数签到完成为橙色，有up标签。","envelopePic":"http://wanandroid.com/blogimgs/ba01d376-924e-46d4-8230-63c89352233c.png","fresh":false,"id":3360,"link":"http://www.wanandroid.com/blog/show/2327","niceDate":"2018-09-06","origin":"","projectLink":"https://github.com/sorgs/StepView","publishTime":1536201210000,"superChapterId":294,"superChapterName":"开源项目主Tab","tags":[{"name":"项目","url":"/project/list/1?cid=358"}],"title":"自定义签到的步骤View","type":0,"userId":-1,"visible":1,"zan":0},{"apkLink":"","author":"cmazxiaoma","chapterId":245,"chapterName":"集合相关","collect":false,"courseId":13,"desc":"","envelopePic":"","fresh":false,"id":3359,"link":"https://www.jianshu.com/p/b8b00da28a49","niceDate":"2018-09-05","origin":"","projectLink":"","publishTime":1536115070000,"superChapterId":245,"superChapterName":"Java深入","tags":[],"title":"通过分析LinkedHashMap了解LRU","type":0,"userId":-1,"visible":1,"zan":0},{"apkLink":"","author":"pqpo","chapterId":401,"chapterName":"二维码","collect":false,"courseId":13,"desc":" A library for cropping image in a smart way that can identify the border and correct the cropped image. 智能图片裁剪框架。自动识别边框，手动调节选区，使用透视变换裁剪并矫正选区；适用于身份证，名片，文档等照片的裁剪。 \r\n","envelopePic":"http://wanandroid.com/blogimgs/6dd1ca2b-99df-403a-9df3-205e1ff483c6.png","fresh":false,"id":3358,"link":"http://www.wanandroid.com/blog/show/2326","niceDate":"2018-09-04","origin":"","projectLink":"https://github.com/pqpo/SmartCropper","publishTime":1536064696000,"superChapterId":294,"superChapterName":"开源项目主Tab","tags":[{"name":"项目","url":"/project/list/1?cid=401"}],"title":"智能图片裁剪框架 自动识别边框，手动调节选区 SmartCropper","type":0,"userId":-1,"visible":1,"zan":0},{"apkLink":"","author":"Qiu800820","chapterId":323,"chapterName":"动画","collect":false,"courseId":13,"desc":"今日头条点赞动画 连击动画 SuperLike","envelopePic":"http://wanandroid.com/blogimgs/29af95d6-67cf-49bb-9ce3-be4ae0a9c44b.png","fresh":false,"id":3357,"link":"http://www.wanandroid.com/blog/show/2325","niceDate":"2018-09-04","origin":"","projectLink":"https://github.com/Qiu800820/SuperLike","publishTime":1536064669000,"superChapterId":294,"superChapterName":"开源项目主Tab","tags":[{"name":"项目","url":"/project/list/1?cid=323"}],"title":"今日头条点赞动画 连击动画 SuperLike","type":0,"userId":-1,"visible":1,"zan":0},{"apkLink":"","author":"meiniepan","chapterId":363,"chapterName":"创意汇","collect":false,"courseId":13,"desc":"抖音上炫代码的不少，有些真的让人叹为观止，作为一个androider，当我看到下面这段舞蹈的时候，终于忍不住了，想要通过android实现一样的效果。\r\n\r\n","envelopePic":"http://wanandroid.com/blogimgs/f495cc0f-2377-4dd7-83f1-bad051a96cf2.png","fresh":false,"id":3356,"link":"http://www.wanandroid.com/blog/show/2324","niceDate":"2018-09-04","origin":"","projectLink":"https://github.com/meiniepan/Pic2Ascii","publishTime":1536064614000,"superChapterId":294,"superChapterName":"开源项目主Tab","tags":[{"name":"项目","url":"/project/list/1?cid=363"}],"title":"抖音上很火的字符画 Pic2Ascii","type":0,"userId":-1,"visible":1,"zan":0},{"apkLink":"","author":"minmin_1123","chapterId":73,"chapterName":"面试相关","collect":false,"courseId":13,"desc":"","envelopePic":"","fresh":false,"id":3355,"link":"https://www.jianshu.com/p/eb570935d586","niceDate":"2018-09-03","origin":"","projectLink":"","publishTime":1535989375000,"superChapterId":186,"superChapterName":"热门专题","tags":[],"title":"2018Android暑期实习面试总结","type":0,"userId":-1,"visible":1,"zan":0},{"apkLink":"","author":"minmin_1123","chapterId":73,"chapterName":"面试相关","collect":false,"courseId":13,"desc":"","envelopePic":"","fresh":false,"id":3354,"link":"https://www.jianshu.com/p/0f72ac621f82","niceDate":"2018-09-03","origin":"","projectLink":"","publishTime":1535989353000,"superChapterId":186,"superChapterName":"热门专题","tags":[],"title":"2019Android秋招提前批面试总结(已拿BAT等6家口头offer)","type":0,"userId":-1,"visible":1,"zan":0},{"apkLink":"","author":"Dogold","chapterId":186,"chapterName":"沉浸式","collect":false,"courseId":13,"desc":"","envelopePic":"","fresh":false,"id":3353,"link":"https://www.cnblogs.com/glorin/p/4962070.html","niceDate":"2018-09-02","origin":"","projectLink":"","publishTime":1535878774000,"superChapterId":186,"superChapterName":"热门专题","tags":[],"title":"Android M如何设置状态栏图标黑白色","type":0,"userId":-1,"visible":1,"zan":0}]
         * offset : 0
         * over : false
         * pageCount : 82
         * size : 20
         * total : 1621
         */

        public int curPage;
        public int offset;
        public boolean over;
        public int pageCount;
        public int size;
        public int total;
        public List<Datas> datas;

        public static class Datas {
            /**
             * apkLink :
             * author : 默非静语
             * chapterId : 249
             * chapterName : 干货资源
             * collect : false
             * courseId : 13
             * desc :
             * envelopePic :
             * fresh : true
             * id : 3374
             * link : https://www.jianshu.com/p/44a4a1c32b4f
             * niceDate : 15小时前
             * origin :
             * projectLink :
             * publishTime : 1536505697000
             * superChapterId : 249
             * superChapterName : 干货资源
             * tags : []
             * title : 分享一些程序员必备网站
             * type : 0
             * userId : -1
             * visible : 1
             * zan : 0
             */

            public String apkLink;
            public String author;
            public int chapterId;
            public String chapterName;
            public boolean collect;
            public int courseId;
            public String desc;
            public String envelopePic;
            public boolean fresh;
            public int id;
            public String link;
            public String niceDate;
            public String origin;
            public String projectLink;
            public long publishTime;
            public int superChapterId;
            public String superChapterName;
            public String title;
            public int type;
            public int userId;
            public int visible;
            public int zan;
            public List<?> tags;
        }
}
