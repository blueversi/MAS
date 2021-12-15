import java.io.Serializable;

public class RegalDocieplony  extends ObjectPlusPlus implements Serializable {

        private String materialDociepleniowy;

        public RegalDocieplony(String materialDociepleniowy) {
                this.materialDociepleniowy = materialDociepleniowy;
        }

        public String getMaterialDociepleniowy() {
                return materialDociepleniowy;
        }

        public void setMaterialDociepleniowy(String materialDociepleniowy) {
                this.materialDociepleniowy = materialDociepleniowy;
        }


}
