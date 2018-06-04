package com.coc.common.configure;

/**
 * Name:FastJsonConfigure
 * Description:
 * Author:yangxiaocui
 * Time: 2018/6/4 10:24
 */

//配置fastjson方式一：启动类继承WebMvcConfigurerAdapter
//@SpringBootApplication
////申明让spring boot自动给程序进行必要的配置，等价于以默认属性使用@Configuration，@EnableAutoConfiguration和@ComponentScan
//public class FastJsonConfigure  extends WebMvcConfigurationSupport{
//
//    @Override
//    public void configureMessageConverters(List<HttpMessageConverter<?>> converters) {
//        super.configureMessageConverters(converters);
//        //核心代码
//      /* 1、先定义一个convert转换消息的对象
//        2、添加fastjson的配置信息，比如是否要格式化返回的json数据；
//        3、在convert中添加配置信息
//        4、将convert添加到converters*/
//
//        //1、先定义一个convert转换消息的对象
//        FastJsonHttpMessageConverter fastConverter = new FastJsonHttpMessageConverter();
//        //2、添加fastjson的配置信息，比如是否要格式化返回的json数据；
//        FastJsonConfig fastJsonConfig = new FastJsonConfig();
//        fastJsonConfig.setSerializerFeatures(
//                //是否需要格式化
//                SerializerFeature.WriteNullListAsEmpty
////                SerializerFeature.WriteNullStringAsEmpty
//        );
//        //附加：处理中文乱码（后期添加）
//        List<MediaType> fastMedisTypes=new ArrayList<MediaType>();
//        fastMedisTypes.add(MediaType.APPLICATION_JSON_UTF8);
//        fastConverter.setSupportedMediaTypes(fastMedisTypes);
//        //3、在convert中添加配置信息
//        fastConverter.setFastJsonConfig(fastJsonConfig);
//        //4、将convert添加到converters
//        converters.add(fastConverter);
//    }
//}


//@Configuration
public class FastJsonConfigure {
//    /*注入Bean : HttpMessageConverters，以支持fastjson*/
//    @Bean
//    public HttpMessageConverters fastJsonHttpMessageConverters() {
//        FastJsonHttpMessageConverter fastConvert = new FastJsonHttpMessageConverter();
//        FastJsonConfig fastJsonConfig = new FastJsonConfig();
//        fastJsonConfig.setSerializerFeatures(
//                SerializerFeature.WriteNullListAsEmpty,
//                SerializerFeature.WriteNullStringAsEmpty);
//        //附加：处理中文乱码（后期添加）
//        List<MediaType> fastMedisTypes = new ArrayList<>();
//        fastMedisTypes.add(MediaType.APPLICATION_JSON_UTF8);
//        fastConvert.setSupportedMediaTypes(fastMedisTypes);
//        fastConvert.setFastJsonConfig(fastJsonConfig);
//        return new HttpMessageConverters((HttpMessageConverter<?>) fastConvert);
//    }

}



