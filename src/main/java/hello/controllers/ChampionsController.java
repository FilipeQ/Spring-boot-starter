package hello.controllers;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import hello.models.Champion;
import hello.models.Job;

@Controller
public class ChampionsController {

	@CrossOrigin(origins = "http://localhost:3000")
	@RequestMapping(value="/getJunglers", method={RequestMethod.GET})
	public @ResponseBody List<Champion> getJunglers(){
		System.out.println("entrou no get junglers");
		Champion jungler1 = new Champion("ZAC","Tank","http://www.mobafire.com/images/champion/icon/zac.png");
		Champion jungler2 = new Champion("Sejuani","Tank","http://www.mobafire.com/images/champion/icon/sejuani.png");
		Champion jungler3 = new Champion("Caniços","Besta","https://scontent.fopo1-1.fna.fbcdn.net/t31.0-8/s960x960/1053503_661672617191866_1319922058_o.jpg");
		
		List <Champion> junglers = new ArrayList<Champion>();
		junglers.add(jungler1);
		junglers.add(jungler2);
		junglers.add(jungler3);
		
		return junglers;
	}
	
	@CrossOrigin(origins = "http://localhost:3000")
	@RequestMapping(value="/addJungler", method={RequestMethod.POST},headers = {"Content-type=application/json"})
	public @ResponseBody boolean addJungler(@RequestBody Champion champion){
		System.out.println("entrou no add junglers");
		System.out.println(champion);
		
		
		return true;
	}
}
