package com.example.mauricio.simpleDagger2WithMockito;

import io.paperdb.Paper;

/**
 * Created by mauricio on 9/5/16.
 */

public class RepositoryImpl implements Repository {

    @Override
    public String getData(String key) {
        return Paper.book().read(key, "No data");
    }

    @Override
    public void setData(String key, String value) {
        Paper.book().write(key, value);
    }
}
