package team.martin.hub.utils;

public enum PermissionsUtils {

    STAFF("hub.staff");

    private String permission;

    public String getPermission() {
        return this.permission;
    }

    PermissionsUtils(String permission) {
        this.permission = permission;
    }

}
