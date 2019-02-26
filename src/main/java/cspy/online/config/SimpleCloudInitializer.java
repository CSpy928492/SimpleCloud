package cspy.online.config;

import java.io.File;
import java.util.List;

/**
 * @author CSpy
 * @date 2019/2/23 21:02
 */
public class SimpleCloudInitializer {

    private File projectDir;
    private List<String> basicDir;

    public void initDir() {
        if (!projectDir.exists()) {
            if (projectDir.mkdir()) {
                System.out.println("路径:" + projectDir.getPath() + " 不存在，已新建。");
            } else {
                System.out.println("路径:" + projectDir.getPath() + " 创建失败，未知原因。");
                System.exit(1);
            }
        } else {
            System.out.println("路径: " + projectDir.getPath() + " 已存在");
        }

        int successCreate = 0;
        for (String item : basicDir) {
            File itemFile = new File(projectDir, item);
            if (!itemFile.exists()) {
                if (itemFile.mkdir()) {
                    System.out.println(item + " 不存在，已新建。");
                    ++successCreate;
                } else {
                    System.out.println(item + " 创建失败，未知原因。");
                    System.exit(1);
                }
            } else {
                ++successCreate;
                System.out.println(item + " 已存在");
            }
        }
        if (basicDir.size() - successCreate != 0) {
            System.out.println("当前有" + (basicDir.size() - successCreate) + "个文件创建失败！");
        } else {
            System.out.println("初始文件夹生成完毕！");
        }
        System.out.println(System.currentTimeMillis());
    }

    public static void initUser() {

    }





    public File getProjectDir() {
        return projectDir;
    }

    public void setProjectDir(File projectDir) {
        this.projectDir = projectDir;
    }

    public List<String> getBasicDir() {
        return basicDir;
    }

    public void setBasicDir(List<String> basicDir) {
        this.basicDir = basicDir;
    }
}
