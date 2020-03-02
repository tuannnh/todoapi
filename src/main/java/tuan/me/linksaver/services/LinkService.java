package tuan.me.linksaver.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tuan.me.linksaver.entities.Link;
import tuan.me.linksaver.repositories.LinkRepository;

import java.io.Serializable;
import java.util.List;

@Service
public class LinkService implements Serializable {

    @Autowired
    LinkRepository linkRepository;

    public List<Link> getALlLinks(){
        return linkRepository.findAll();
    }

    public Link addLink(Link link) {
        Link result =  linkRepository.save(link);
        return result;
    }

    public void deleteLink(int id) {
        linkRepository.deleteById(id);
    }
}
