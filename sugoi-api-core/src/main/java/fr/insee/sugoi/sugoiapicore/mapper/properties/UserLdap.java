
package fr.insee.sugoi.sugoiapicore.mapper.properties;

import fr.insee.sugoi.sugoiapicore.mapper.properties.utils.AttributeLdapName;
import fr.insee.sugoi.sugoiapicore.mapper.properties.utils.MapToAttribute;
import fr.insee.sugoi.sugoiapicore.mapper.properties.utils.MapToMapElement;

public class UserLdap {

    @MapToAttribute("username")
    @AttributeLdapName("uid")
    public String identifiant;

    @AttributeLdapName("cn")
    @MapToMapElement(name = "attributes", key = "common_name")
    public String nomCommun;

    @AttributeLdapName("sn")
    @MapToAttribute("lastName")
    public String nom;

    @AttributeLdapName("givenName")
    @MapToAttribute("firstName")
    public String prenom;

    @AttributeLdapName("mail")
    @MapToAttribute("mail")
    public String adresseMessagerie;

    @AttributeLdapName("telephoneNumber")
    @MapToMapElement(name = "attributes", key = "phone_number")
    public String numeroTelephone;

    @AttributeLdapName("description")
    @MapToMapElement(name = "attributes", key = "description")
    public String description;

    @AttributeLdapName("inseeAdressePostaleDn")
    @MapToMapElement(name = "attributes", key = "address_dn")
    public String adresseDN;

    @AttributeLdapName("adresse")
    @MapToMapElement(name = "attributes", key = "organisationDn")
    public String organisationDeRattachementDN;

    @AttributeLdapName("personalTitle")
    @MapToMapElement(name = "attributes", key = "personal_title")
    public String civilite;

    @AttributeLdapName("inseeIdentifiantMetier")
    @MapToMapElement(name = "attributes", key = "identifiant_metier")
    public String identifiantMetier;

    @AttributeLdapName("inseerepertoirededistribution")
    @MapToMapElement(name = "attributes", key = "repertoire_distribution")
    public String repertoireDeDistribution;

    @AttributeLdapName("inseenumerotelephoneportable")
    @MapToMapElement(name = "attributes", key = "telephone_portable")
    public String telephonePortable;

    @AttributeLdapName("facsimiletelephonenumber")
    public String facSimile;

    @AttributeLdapName("o")
    @MapToMapElement(name = "attributes", key = "organisation")
    private String organisation;

    @AttributeLdapName("inseeTimbre")
    @MapToMapElement(name = "attributes", key = "insee_timbre")
    private String inseeTimbre;

    @AttributeLdapName("inseeOrganisme")
    @MapToMapElement(name = "attributes", key = "insee_organisme")
    private String inseeOrganisme;

    @AttributeLdapName("inseeAdresseCorrespondantLigne1")
    private String inseeAdresseCorrespondantLigne1;

    @AttributeLdapName("inseeAdresseCorrespondantLigne2")
    private String inseeAdresseCorrespondantLigne2;

    @AttributeLdapName("inseeAdresseCorrespondantLigne3")
    private String inseeAdresseCorrespondantLigne3;

    @AttributeLdapName("postalCode")
    private String postalCode;

    @AttributeLdapName("inseenomcorrespondant")
    private String inseeNomCorrespondant;

    @AttributeLdapName("inseemailcorrespondant")
    private String inseeMailCorrespondant;

    @AttributeLdapName("inseetelephonenumbercorrespondant")
    private String inseeTelephoneNumberCorrespondant;

    @MapToMapElement(name = "metadatas", key = "modifyTimestamp")
    @AttributeLdapName("modifyTimestamp")
    private String dateModification;

}