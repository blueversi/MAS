public abstract class ObjectPlus4 extends ObjectPlusPlus {


    public ObjectPlus4() {
        super();
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