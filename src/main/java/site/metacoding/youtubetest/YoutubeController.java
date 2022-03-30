package site.metacoding.youtubetest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class YoutubeController {
    
    @GetMapping("/")
    public String test(){
        return "/youtubeTest";
    }
}
