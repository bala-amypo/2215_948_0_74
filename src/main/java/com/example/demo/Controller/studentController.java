import com.example.demo.service.*;
import org.springframework.beans.factory.annotation.*;

import com.example.demo.entity.*;
import com.example.demo.service.*;

@RestController
public class studentController{
    @Autowired
    studentService service;

    @getMapping("/getAllStudent")
    public List<studentEntity>getAll(){
        return service.getAll();
    }
}