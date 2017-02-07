
def props = [:]
props['groupId'] = ask('What is the groupId for your plugin?\n')
props['pluginName'] = ask('What is the short name for your plugin?\n').toLowerCase()
props['version'] = ask("What is the project's initial version?\n", '0.1', 'version')
props['pluginDescription'] = ask('Enter a short (one line) description of the plugin\n')
props['pluginAuthor'] = ask('What is your name?\n')

processTemplates 'build.gradle', props
processTemplates 'settings.gradle', props
