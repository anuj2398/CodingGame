package com.crio.jukebox.entities;

public class User extends BaseEntities{
    private final String userName;

    public User(String id,String userName){
        this.id=id;
        this.userName=userName;
    }
    public User(String userName){
        this.userName=userName;
    }
    public String getName(){
        return userName;
    }
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((id == null) ? 0 : id.hashCode());
        return result;
    }
    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        User other = (User) obj;
        if (id == null) {
            if (other.id != null)
                return false;
        } else if (!id.equals(other.id))
            return false;
        return true;
    }

    @Override
    public String toString() {
        return "User [id=" + id + ", name=" + userName + " ]";
    }
}
