import java.util.LinkedList;
import java.util.List;

public abstract class ObjectPlus4 extends ObjectPlusPlus {

    private List<String> rolesXOR = new LinkedList<>();

    public ObjectPlus4() {
        super();
    }
    public void addXorRole(String xorRoleName) {
        rolesXOR.add(xorRoleName);
    }

    public void addLinkXor(String roleName, String reverseRoleName, ObjectPlusPlus targetObject) throws Exception {
        for (String role: rolesXOR
             ) {
        }
        if(rolesXOR.contains(roleName)) {
            // The currently adding role is XOR'ed

            // Check if there is a link for XOR'ed roles
            if(isXorLink()) {
                throw new Exception("Istnieje powiązanie do roli XOR!");
            }

            // There is no link ==> add a link using an already existing method from a super class
        }

        // Add the link
        super.addLink(roleName, reverseRoleName, targetObject);
    }

    private boolean isXorLink() {

        for(String role : rolesXOR) {
            if(this.anyLink(role)) {
                return true;
            }
        }

        return false;
    }

    public void addLink_subset(String roleName, String reverseRoleName, String superRoleName, ObjectPlusPlus targetObject) throws Exception {
        if(isLink(superRoleName, targetObject)) {
            addLink(roleName, reverseRoleName, targetObject);
        }
        else {
            throw new Exception("Brak powiązania '" + targetObject + "'  z rolą'" + superRoleName + "'!");
        }
    }


}