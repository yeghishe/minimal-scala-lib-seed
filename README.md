minimal-scala-lib-seed
=========================

[![Build Status][build-status-badge]][build-status-url]
[![Code Quality][code-quality-badge]][code-quality-url]

[![Issues][issues-badge]][issues-url]

[![License][license-badge]][license-url]
[![Chat][chat-badge]][chat-url]

## To create a new project run

```
activator new <YOUR PROJECT NAME> minimal-scala-lib-seed
```

## Overview
The project is intended to be used as an activator template to generate scala library projects.
From the command line, you can execute `activator new <YOUR PROJECT NAME> minimal-scala-lib-seed` to generate a project. From activator UI find the template named `minimal-scala-lib-seed` and generate your project using it.

Once the project is generated you get few things out of the box:
* [Config](https://github.com/yeghishe/minimal-scala-akka-http-seed/blob/master/src/main/scala/io/github/yeghishe/Config.scala) is handled using [Ficus](https://github.com/ceedubs/ficus). Make sure to create your case classes for new config values you add in typesafe config. You can later mix in `Config` trait or import your values from `Config` object.
* The project comes with [Cats](http://typelevel.org/cats/) library also.
* The project uses [ScalaTest](http://www.scalatest.org/) for unit testing.
* [Scalafmt](https://github.com/olafurpg/scalafmt) is being used for code formatting.
* [Scalastyle](http://www.scalastyle.org/) is being used fro code style checking.
* [Scoverage](https://github.com/scoverage/sbt-scoverage) is being used for code coverage .


[build-status-badge]: https://img.shields.io/travis/yeghishe/minimal-scala-lib-seed.svg?style=flat-square
[build-status-url]: https://travis-ci.org/yeghishe/minimal-scala-lib-seed
[code-quality-badge]: https://img.shields.io/codacy/e7c42361e393412e84f50d955aefad66.svg?style=flat-square
[code-quality-url]: https://www.codacy.com/app/ypiruzyan/minimal-scala-lib-seed
[issues-badge]: https://img.shields.io/github/issues/yeghishe/minimal-scala-lib-seed.svg?style=flat-square
[issues-url]: https://github.com/yeghishe/minimal-scala-lib-seed/issues
[license-badge]: https://img.shields.io/badge/License-Apache%202-blue.svg?style=flat-square
[license-url]: LICENSE
[chat-badge]: https://img.shields.io/badge/gitter-join%20chat-brightgreen.svg?style=flat-square
[chat-url]: https://gitter.im/yeghishe/minimal-scala-lib-seed
