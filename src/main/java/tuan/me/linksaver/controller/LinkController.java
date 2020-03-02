package tuan.me.linksaver.controller;


import tuan.me.linksaver.entities.Link;
import tuan.me.linksaver.services.LinkService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/saves")
public class LinkController {

    @Autowired
    LinkService linkService;

    @CrossOrigin
    @PostMapping
    @RequestMapping("/add")
    public Link addLink(@RequestBody Link newLink){
       return linkService.addLink(newLink);

    }

    @CrossOrigin
    @PostMapping
    @RequestMapping("/delete/{id}")
    public void get(@PathVariable int id)
    {
        linkService.deleteLink(id);
    }

    @CrossOrigin
    @GetMapping
    @RequestMapping("/get")
    public List<Link> getAllLink(){

        return  linkService.getALlLinks();
    }
}
