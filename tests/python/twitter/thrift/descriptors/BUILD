# ==================================================================================================
# Copyright 2011 Twitter, Inc.
# --------------------------------------------------------------------------------------------------
# Licensed under the Apache License, Version 2.0 (the "License");
# you may not use this work except in compliance with the License.
# You may obtain a copy of the License in the LICENSE file, or at:
#
#  http://www.apache.org/licenses/LICENSE-2.0
#
# Unless required by applicable law or agreed to in writing, software
# distributed under the License is distributed on an "AS IS" BASIS,
# WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
# See the License for the specific language governing permissions and
# limitations under the License.
# ==================================================================================================


# python_tests resources aren't currently copied to the chroot, so we have to indirect
# through this python_library.
# TODO: Support resources in python_tests targets.
python_library(name = 'test_data',
  dependencies = [],
  sources = [],
  resources = globs('test_data/*')
)

python_tests(name = 'descriptors',
  dependencies = [
    pants('3rdparty/python:thrift-0.7'),
    pants('src/python/twitter/thrift/descriptors'),
    pants('src/python/twitter/thrift/text'),
    pants('src/thrift/com/twitter/thrift/descriptors:descriptors-py'),
    pants(':test_data')
  ],
  sources = globs('*.py'),
)
