package io.github.redhatappstudio.jvmbuild.cli.artifacts;

import picocli.CommandLine;

@CommandLine.Command(name = "artifact", subcommands = { ArtifactLogsCommand.class, ArtifactSummaryCommand.class,
        ArtifactListCommand.class, ArtifactRebuildCommand.class, ArtifactFixMissingCommand.class })
public class ArtifactCommand {
}