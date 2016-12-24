package info.xiaomo.application.service;


import info.xiaomo.application.model.ShikigamiModel;

/**
 * @author 小莫 (https://xiaomo.info) (https://github.com/syoubaku)
 * @created : 2016/12/24 15:54
 */
public interface ShikigamaService {

    ShikigamiModel findByName(String name);

    void save(ShikigamiModel model);

}
