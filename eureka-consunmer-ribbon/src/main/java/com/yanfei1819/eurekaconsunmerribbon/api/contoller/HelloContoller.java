package com.yanfei1819.eurekaconsunmerribbon.api.contoller;import org.springframework.beans.factory.annotation.Autowired;import org.springframework.web.bind.annotation.GetMapping;import org.springframework.web.bind.annotation.RestController;import org.springframework.web.client.RestTemplate;/** * Created by shiyanfei on 2019-01-08. */@RestControllerpublic class HelloContoller {    @Autowired    private RestTemplate restTemplate;    @GetMapping("/")    public String helloByRibbon(){        String result = restTemplate.getForObject("http://eureka-client/sayHello",String.class);        // 如果要以别名的方式进行服务间的相互调用，就必须依赖ribbon客户端的负载均衡器。其作用是可以控制http和tcp的一些行。        System.out.println(result);        return result;    }}