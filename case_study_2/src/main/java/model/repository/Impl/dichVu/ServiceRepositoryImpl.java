package model.repository.Impl.dichVu;

import model.bean.Service;
import model.repository.BaseRepository;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class ServiceRepositoryImpl implements IServiceRepository{
    private BaseRepository baseRepository = new BaseRepository();
    @Override
    public List<Service> list() {
        List<Service> list = new ArrayList<>();
        try {
            PreparedStatement preparedStatement = this.baseRepository.getConnection().prepareStatement
                    ("select * \n" +
                    " from service");
            ResultSet resultSet = preparedStatement.executeQuery();
            Service service = null;
            while (resultSet.next()){
                service = new Service();
                service.setId(resultSet.getInt("service_id"));
                service.setName(resultSet.getString("service_name"));
                service.setAre(resultSet.getInt("service_area"));
                service.setCost(resultSet.getString("service_cost"));
                service.setMaxPeople(resultSet.getInt("service_max_people"));
                service.setRendType(resultSet.getString("rent_type_int"));
                service.setServiceType(resultSet.getString("service_type_id"));
                service.setStandandRoom(resultSet.getString("standard_room"));
                service.setDescriptionOtherConvenience(resultSet.getString("description_other_convenience"));
                service.setPoolArea(resultSet.getString("pool_area"));
                service.setNumberOfFloor(resultSet.getInt("number_of_floor"));
                list.add(service);
            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return list;
    }

    @Override
    public void create(Service service) {

    }
}
