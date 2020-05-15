25
https://raw.githubusercontent.com/Sauilitired/Hyperverse/master/Core/src/main/java/se/hyperver/hyperverse/util/SeedUtil.java
//
// Hyperverse - A Minecraft world management plugin
//
// This program is free software: you can redistribute it and/or modify
// it under the terms of the GNU General Public License as published by
// the Free Software Foundation, either version 3 of the License, or
// (at your option) any later version.
//
// This program is distributed in the hope that it will be useful,
// but WITHOUT ANY WARRANTY; without even the implied warranty of
// MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
// GNU General Public License for more details.
//
// You should have received a copy of the GNU General Public License
// along with this program. If not, see <http://www.gnu.org/licenses/>.
//

package se.hyperver.hyperverse.util;

import java.util.concurrent.ThreadLocalRandom;

/**
 * Seed utility methods
 */
public final class SeedUtil {

    private SeedUtil() {
    }

    /**
     * Generate a random seed
     *
     * @return Randomly generated seed
     */
    public static long randomSeed() {
        return ThreadLocalRandom.current().nextLong();
    }

}