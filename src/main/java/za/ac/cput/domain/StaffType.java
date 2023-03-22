package za.ac.cput.domain;

import java.util.Objects;

public class StaffType {
    public String postionId;
    public String positionType;

    public StaffType(String postionID, String positionType) {
        this.postionId = postionID;
        this.positionType = positionType;
    }


    public String getPostionID() {
        return postionId;
    }

    public String getPositionType() {
        return positionType;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        StaffType staffType = (StaffType) o;
        return Objects.equals(postionId, staffType.postionId) && Objects.equals(positionType, staffType.positionType);
    }

    @Override
    public int hashCode() {
        return Objects.hash(postionId, positionType);
    }


    @Override
    public String toString() {
        return "StaffType{" +
                "postionID='" + postionId + '\'' +
                ", positionType='" + positionType + '\'' +
                '}';
    }


    public StaffType(Builder b){
        this.positionType = b.positionType;
        this.postionId = b.positionId;
    }

    public static class Builder{
        public String positionType;
        public String positionId;

        public Builder setPositionId(String positionId){
            this.positionId = positionId;
            return this;
        }

        public Builder setPositionType(String positionType){
            this.positionType = positionType;
            return this;
        }

        public Builder copy(StaffType stafftype){
            this.positionType = stafftype.positionType;
            this.positionId = stafftype.postionId;
            return this;
        }

        public StaffType build(){
            return new StaffType(this);
        }


    }



}
