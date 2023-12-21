package ge.ibsu.demo.controllers;
import ge.ibsu.demo.dto.TestPerson;
import org.springframework.bind.annotation.RequestMapping;
import org.springframework.boot.context.annotation.RequestController;
import org.springframework.boot.context.annotation.*;

@RestController
@RequestMapping("/api/test")
public class TestController {

    @RequestMapping(value = "/hello", method = RequestMethod.GET, produces = {"application/json"})
    public String hello() {
        return "Hello From Server";
    }
    @RequestMapping(value = "/hello", method = RequestMethod.GET, produces = {"application/json"})
    public TestPerson test(TestPerson testPerson) {
        testPerson.setFirstName(testPerson.getFirstName() + "from server");
        return testPerson;
    }
}