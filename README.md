# NYC Subway Tracker

This is a simple Android application that:

* asks the user to select a station on the New York subway system,
* makes a request to an HTTP server (which I have yet to set up), 
* which in turn requests [GTFS Realtime](https://developers.google.com/transit/gtfs-realtime/) data from the [Metropolitan Transit Authority](https://new.mta.info/),
* converts the GTFS Realtime data to JSON,
* and then displays a list of the next trains to arrive to the user.

## Status

This project is not yet complete. Please check back later on its status.

## Mirror

The main repository is hosted on [GitLab](https://gitlab.com/cmjones/nyc-subway-tracker), but there is also a mirror on [GitHub](https://github.com/jones-cody/nyc-subway-tracker/).

## Built With

* [MTAPI](https://github.com/jonthornton/MTAPI/) &ndash; HTTP server used to convert [GTFS Realtime](https://developers.google.com/transit/gtfs-realtime/) data to JSON

## Contributors

* [Cody M. Jones](https://gitlab.com/cmjones) &ndash; author

## License [![License: GPLv3](https://img.shields.io/badge/License-GPLv3-blue.svg)](https://www.gnu.org/licenses/gpl-3.0)

This project is licensed under the GNU General Public License v3.0. See [LICENSE.md](LICENSE.md) for details.
