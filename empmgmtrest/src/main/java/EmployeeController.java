import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/emp")

public class EmployeeController {

    @RequestMapping(value="/health", method= RequestMethod.GET,produces ={MediaType.TEXT_HTML_VALUE})

    public String healthCheck() {

        return "emp-service-running fine...";

    }
}
