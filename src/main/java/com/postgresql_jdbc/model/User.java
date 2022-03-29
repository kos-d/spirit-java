package com.postgresql_jdbc.model;

import lombok.Data;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class User {

    private int id;
    private String login;
    private String password;
    private Role role;
    
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof User)) return false;
        User user = (User) o;
        return login.equals(user.login) && password.equals(user.password) && role.equals(user.role);
    }
    
    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + login.hashCode();
        result = 31 * result + password.hashCode();
        result = 31 * result + role.hashCode();
        return result;
    }

    @Data
    @AllArgsConstructor
    public static class Role {

        private int id;

        private String name;

        // Var 2 equals and hashCode
        @Override
        public boolean equals(Object o) {
            if (this == o) {
                return true;
            }
            if (!(o instanceof Role)) {
                return false;
            }
            Role role = (Role) o;
            return name.equals(role.name);
        }
        
        @Override
        public int hashCode() {
            int result = super.hashCode();
            result = 31 * result + name.hashCode();
            return result;
        }
        // Var 2 equals  and hashCode
        /*
        @Override
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null) {
                return false;
            }
            if (getClass() != obj.getClass()) {
                return false;
            }
            final Role other = (Role) obj;
            if (this.id != other.id) {
                return false;
            }
            return Objects.equals(this.name, other.name);
        }
        
        @Override
        public int hashCode() {
            int hash = 7;
            hash = 29 * hash + this.id;
            hash = 29 * hash + Objects.hashCode(this.name);
            return hash;
        }
         */
    }
}
