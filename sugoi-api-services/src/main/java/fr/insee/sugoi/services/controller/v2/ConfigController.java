package fr.insee.sugoi.services.controller.v2;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import fr.insee.sugoi.services.mapper.RealmViewMapper;
import fr.insee.sugoi.services.view.RealmView;
import fr.insee.sugoi.sugoiapicore.service.ConfigService;

@RestController
@RequestMapping(value = { "/v2/config", "/config" })
public class ConfigController {

    @Autowired
    private ConfigService configService;

    @Autowired
    private RealmViewMapper realmViewMapper;

    @GetMapping(produces = { MediaType.APPLICATION_XML_VALUE, MediaType.APPLICATION_JSON_VALUE }, value = "/realm/{id}")
    public RealmView getRealm(@PathVariable("id") String id) {
        return realmViewMapper.mapperHandly(configService.getRealm(id));
    }

    @GetMapping(produces = { MediaType.APPLICATION_XML_VALUE, MediaType.APPLICATION_JSON_VALUE }, value = "/realms")
    public List<RealmView> getRealms() {
        return configService.getRealms().stream().map(realm -> realmViewMapper.mapperHandly(realm))
                .collect(Collectors.toList());
    }

}
