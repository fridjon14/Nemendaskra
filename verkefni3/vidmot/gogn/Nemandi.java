package vidmot.gogn;

/**
 * Nemendaskrá inniheldur nafn, netfang og
 * á hvaða deild, sviði og námsleið nemandi er á.
 * @author Friðjón Sigvaldason frs5@hi.is
 * Háskóli Íslands
 */
public class Nemandi {
    private String nafn;
    private String netfang;
    private String svid;
    private String deild;
    private String namsleid;

    public Nemandi() {

    }


    public Nemandi(String nafn, String netfang, String svid, String deild, String namsleid) {
        this.nafn = nafn;
        this.netfang = netfang;
        this.svid = svid;
        this.deild = deild;
        this.namsleid = namsleid;
    }
    public void setNemandi(Nemandi nemandi){

    }

    public String getNafn() {
        return nafn;
    }

    public void setNafn(String nafn) {
        this.nafn = nafn;
    }

    public String getNetfang() {
        return netfang;
    }

    public void setNetfang(String netfang) {
        this.netfang = netfang;
    }

    public String getSvid() {
        return svid;
    }

    public void setSvid(String svid) {
        this.svid = svid;
    }

    public String getDeild() {
        return deild;
    }

    public void setDeild(String deild) { this.deild = deild; }

    public String getNamsleid() {
        return namsleid;
    }

    public void setNamsleid(String namsleid) { this.namsleid = namsleid; }

    @Override
    public String toString() {
        return (getNamsleid()+
                getNafn()+ " " +
                getSvid()+ " " +
                getDeild()+ " " +
                getNamsleid());
    }
}
