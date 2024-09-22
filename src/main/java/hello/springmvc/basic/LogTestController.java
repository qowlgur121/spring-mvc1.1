package hello.springmvc.basic;

import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j //이 애노테이션을 추가하면 롬복이 private final Logger log = LoggerFactory.getLogger(getClass());를 자동으로 생성해줌
@RestController //@Controller + @ResponseBody. 반환값을 HTTP 응답 바디에 포함시킴
public class LogTestController {

    //private final Logger log = LoggerFactory.getLogger(getClass()); //현재 클래스의 로거를 가져온다.

    @RequestMapping("/log-test")
    public String logTest() {
        String name = "Spring";

        System.out.println("name = " + name); //권장x

        //SLF4J Logger를 사용하여 다양한 레벨의 로그를 출력 (권장)
        log.trace("trace log={}", name);
        log.debug("debug log={}", name);
        log.info(" info log={}", name);
        log.warn(" warn log={}", name);
        log.error("error log={}", name);

        return "ok"; //반환값을 HTTP 응답 바디에 포함됨.
    }

}
