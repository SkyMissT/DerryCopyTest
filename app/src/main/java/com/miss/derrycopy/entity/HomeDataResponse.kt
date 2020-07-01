package com.miss.derrycopy.entity

/**
 *   Created by Vola on 2020/7/1.
 */

/**
 * data : {
 * "ad_list":[{"image":"http://resource.ffu365.com/upload/images/default/2016-06-04/57529302a2f602.54526763.jpg",
 *                  "link":"http://m.ffu365.com/static/bas/1.html"}],
 * "company_list":[{"image":"http://resource.ffu365.com/upload/images/default/2016-06-02/574fd1fb4b91d8.93153953.jpg",
 *                  "link":"http://app.ffu365.com/pages/company.html"}],
 * "news_list":[{"title":"天天防腐APP产品定位及功能介绍","create_time":"2016-05-01","link":"http://m.ffu365.com/static/News/news.html?id=10"},
 *  {"title":"全球腐蚀调研项目结果公布","create_time":"2016-03-23","link":"http://m.ffu365.com/static/News/news.html?id=11"},
 *  {"title":"天天防腐APP上线啦！！！","create_time":"2015-09-05","link":"http://m.ffu365.com/static/News/news.html?id=12"},
 *  {"title":"天天防腐APP开始内测","create_time":"2015-05-08","link":"http://m.ffu365.com/static/News/news.html?id=13"},
 *  {"title":"天天防腐团队组建","create_time":"2014-07-20","link":"http://m.ffu365.com/static/News/news.html?id=14"}]
 *  }
 * errcode : 1
 * errmsg : 操作成功
 * errdialog : 0
 */

class HomeDataResponse {


data class AdListBean(val image: String, val link: String)


}