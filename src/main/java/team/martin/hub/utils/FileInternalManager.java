package team.martin.hub.utils;

import team.martin.hub.Main;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Objects;

public class FileInternalManager {
    public BufferedReader getResourcesBufferedReader(String path){
        InputStream getResourceFolder = Main.class.getResourceAsStream("/" + path);
        return new BufferedReader(new InputStreamReader(Objects.requireNonNull(getResourceFolder)));
    }
}
