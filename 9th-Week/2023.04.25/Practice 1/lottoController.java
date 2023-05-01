package com.example.springedu.controller;
import com.example.springedu.domain.LottoDTO;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@SessionAttributes("count")
public class lottoController {
    @ModelAttribute("count")
    public int[] createCount() {
        return new int[1];  
    }
    @RequestMapping("/lotto")
    public String lottoProcess(LottoDTO vo, @ModelAttribute("count")int arr[]){
        if(arr[0] >=3) {
            vo.setResult("로또 응모는 낙첨된 경우에 한하여 3번까지만 가능합니다 <br>브라우저 재가동한 후에 응모해주세요");
            vo.setImgName("images/snow.png");
        }else{
            int randNum = ((int) Math.random() * 6) + 1;
            if (randNum == vo.getLottoNum()){
                vo.setResult("추카추카");
                vo.setImgName("images/apeach.jpg");
                arr[0] = 3;
            }else {
                vo.setResult("아쉽네요... 다음기회를!!!");
                vo.setImgName("images/banana.jpg");
                arr[0]++;
            }
        } return "lottoView";
    }
}
