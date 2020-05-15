9
https://raw.githubusercontent.com/everest-engineering/lhotse/master/organizations/src/main/java/engineering/everest/lhotse/organizations/domain/events/OrganizationNameUpdatedByAdminEvent.java
package engineering.everest.lhotse.organizations.domain.events;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.axonframework.serialization.Revision;

import java.util.UUID;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Revision("0")
public class OrganizationNameUpdatedByAdminEvent {
    private UUID organizationId;
    private String organizationName;
    private UUID adminId;
}