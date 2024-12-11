package chirkans.pkmn.converters;


import chirkans.pkmn.models.EnergyType;
import jakarta.persistence.AttributeConverter;
import jakarta.persistence.Converter;

@Converter
public class EnergyTypeConverter implements AttributeConverter<EnergyType, String> {

    @Override
    public String convertToDatabaseColumn(EnergyType attribute) {
        return attribute == null ? null : attribute.name();
    }

    @Override
    public EnergyType convertToEntityAttribute(String dbData) {
        if (dbData == null || dbData.isEmpty()) {
            return null;
        }
        try {
            return EnergyType.valueOf(dbData.toUpperCase());
        } catch (IllegalArgumentException e) {
            return null;
        }
    }
}

