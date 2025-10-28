package com.revision.demo.annotations;

import org.springframework.stereotype.Component;
import static com.revision.demo.annotations.ExpertType.Type.*;

@ExpertType(py)
@Component//("py")
public class PythonExperties implements IExperties{

    @Override
    public void display() {

        System.out.println("Python Experties");

    }

}
