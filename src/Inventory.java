import java.util.ArrayList;
import java.util.List;

public class Inventory {

    private List<Phone> phones;

    public List<Phone> search(PhoneSpec phoneSpec){
        List<Phone> matches = new ArrayList<>();

        for (Phone ps: getPhones()) {
            if(ps.getPhoneSpec().matches(phoneSpec))
                matches.add(ps);
        }

        return matches;
    }

    public List<Phone> getPhones() {
        return phones;
    }

    public void setPhones(List<Phone> phones) {
        this.phones = phones;
    }
}
