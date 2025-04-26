# Create preview images of video files which are referenced in TeX files via
# the user-defined "\vlink" command.
#
# The "\vlink" command has followingn syntax:
#
#   \vlink[parameters}{filename}
#
# For instance: \vlink[width=\textwidth]{my_video.mp4}
#
# Use following programs:
# 1. "grep" to find "\vlink" commands recursively.
# 2. "sed" to extract "filename"
#    - Use a regex group to capture the content between braces.
#    - Note: "(", ")" and "+" characters must be escaped in "sed"!
# 3. "find" to find video file in pre-defined video_folder.
# 4. "ffmepg" to extract the first frame as preview image.

video_files=$(grep -E "\\vlink(\[.+\])?\{.+\}" -r . | sed "s/.*{\(.\+\).*}/\1/")
video_folder="./Videos"

for video_file in ${video_files}
do
    find ${video_folder} -regex ".*${video_file}" -type f -exec ffmpeg -i {} -ss 00:00:01 -vframes 1 -y -hide_banner {}.preview.png \;
done
